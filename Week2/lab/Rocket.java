public class Rocket
{
	public static void main(String[] args)
	{
		/* Initialize variables */
		double rhoNaught = 1.225;
		double g = 9.80665;
		double atmosphericMolarMass = 0.0289644;
		double idealGasConstant = 8.31447;
		double temperatureAtmos = 255.0;
		double dragCoefficient = 0.5;
		double crossSection = 10.0;
		double emptyMass = 10000.0;
		double fuelMass = 10000.0;
		double payloadMass = 0.0;
		double exhaustVelocity = 7000.0;
		double burnRate = 100.0;
		double massEarth = 5.972e24;
		double radiusEarth = 6.371e6;
		double G = 6.67e-11;

		double time = 0.0;
		double y = 0.0;
		double v = 0.0;
		double a = 0.0;
		double deltaTime = 1.0e-3;

		/* For each timestep */
		while (v >= 0.0)
		{
			/* Calculate acceleration */

			/* Calculate air density */
			double rho = rhoNaught * Math.exp(
				-(g * atmosphericMolarMass * y) /
				 (idealGasConstant * temperatureAtmos)
			);

			/* Calculate drag */
			double drag = (0.5 * rho * v * v * dragCoefficient * crossSection) /
				      (emptyMass + payloadMass + fuelMass);

			/* Calculate gravity */
			double gravity = (G * massEarth) /
					 (Math.pow(y + radiusEarth, 2));

			/* If fuel remains calculate thrust */
			double thrust = 0.0;

			if (fuelMass > 0.0)
			{
				thrust = (exhaustVelocity * burnRate) /
					 (emptyMass + payloadMass + fuelMass);
			}

			/* Acceleration = (thrust – gravity – drag) */
			a = thrust - gravity - drag;

			/* Calculate new velocity (v = v + a * dt) */
			v += a * deltaTime;

			/* Calculate new position (y = y + v * dt) */
			y += v * deltaTime;

			/* Calculate new fuel mass */
			if (thrust > 0.0)
			{
				fuelMass -= burnRate * deltaTime;
			}

			/* Calculate escape velocity */
			double escapeVelocity = Math.sqrt(
				(2 * G * massEarth) /
				(radiusEarth + y)
			);

			/* Output values at each timestep */
			System.out.printf("%9.3f %9.3f %9.3f %9.3f %9.3f\n", time, y, v, escapeVelocity, fuelMass);

			/* Update time */
			time += deltaTime;
		}
	}
}

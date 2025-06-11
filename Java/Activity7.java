package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Activity7 {
		private List<String> passengers;
		private final int maxPassengers;
		private Date lastTimeTookOf;
		private Date lastTimeLande;

		public Activity7(int maxPassengers) {
			this.maxPassengers = maxPassengers;
			this.passengers = new ArrayList<>();
		}

		public void onboard(String passengerName) {
			if (passengers.size() <= maxPassengers) {
				this.passengers.add(passengerName);
			} else

			{
				System.out.println("Plane is full");
			}
		}

		public Date setTakeOff() {
			this.lastTimeTookOf = new Date();
			return lastTimeTookOf;
		}

		public void setLand() {
			this.lastTimeLande = new Date();
			this.passengers.clear();
		}

		public Date getLastTimeLanded() {
			return lastTimeLande;
		}

		public List<String> getPassengers() {
			return passengers;
		}

			public static void main(String[] args) throws InterruptedException {
				Activity7 plane = new Activity7(10);
				plane.onboard("John");
				plane.onboard("Steve");
				plane.onboard("Anna");
				System.out.println("Plane took of at: " + plane.setTakeOff());
				System.out.println("Plane on the plane: " + plane.getPassengers());
				Thread.sleep(5000);
				plane.setLand();
				System.out.println("Plane landed at: " + plane.getLastTimeLanded());
				System.out.println("People on the plane after Landing: " + plane.getPassengers());
			}

	}


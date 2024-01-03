class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        float[] time = new float[target];

        for(int i=0;i<position.length;i++)
        {
            time[position[i]] = (float) (target-position[i])/speed[i];
        }

        int fleet =0;
        float maxTime = 0;

        for(int i=target-1;i>=0;i--)
        {
            if(time[i] > maxTime)
            {
                maxTime = time[i];
                fleet++;
            }
        }
        // Car[] cars = new Car[speed.length];
        // for(int i=0;i<speed.length;i++)
        // {
        //     cars[i] = new Car(position[i],speed[i]);
        // }

        // Arrays.sort(cars,(x,y)-> Integer.compare(y.position,x.position));

        // int fleet =0 ;
        // double lastCarArrived= 0;

        // for(Car car: cars)
        // {
        //     double arrivalTime = (target-car.position)/(double) car.speed;

        //     if(arrivalTime > lastCarArrived)
        //     {
        //         fleet++;
        //         lastCarArrived = arrivalTime;
        //     }
        // }
        return fleet;
    }

    // class Car
    // {
    //     public int position;
    //     public int speed;

    //     public Car(int position, int speed)
    //     {
    //         this.position = position;
    //         this.speed = speed;
    //     }
    // }
}

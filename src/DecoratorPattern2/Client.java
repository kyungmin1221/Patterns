package DecoratorPattern2;

//public class Client {
//    public static void main(String[] args) {
//        Display road = new RoadDisplay() ;
//            for ( String decoratorName : args ) {
//                    if ( decoratorName.equalsIgnoreCase("Lane")) road = new LaneDecorator(road) ;
//                    if ( decoratorName.equalsIgnoreCase("Traffic")) road = new TrafficDecorator(road) ;
//                    if ( decoratorName.equalsIgnoreCase("Crossing")) road = new CrossingDecorator(road) ;
//        }
//        road.draw() ;
//    }
//}

//  -> 출력 : 도로 기본 표시



public class Client {
    public static void main(String[] args) {
        Display roadWithCrossingAndTrafficAndLane =
            new LaneDecorator( new TrafficDecorator(new CrossingDecorator( new RoadDisplay()))) ;

        roadWithCrossingAndTrafficAndLane.draw() ;
    }
}
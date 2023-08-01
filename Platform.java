/**
 * This program returns the platform no. of the train by its route
 */
class platform {
    public static void main(String[] args) {
        char route;
        System.out.println("---Welcome to Secunderabad Railway Station---");
        System.out.println("Route Code:");
        System.out.println("Mumbai Route code --> M (or) m");
        System.out.println("Chennai Route code --> C (or) c");
        System.out.println("Kolkata Route code --> K (or) k");
        System.out.println("Banglore Route code --> B (or) b");
        System.out.println("Vishakapatnam Route code --> V (or) v");
        System.out.print("Enter the Route code --> "); //Asking for inout
        System.out.flush(); // clears the output stream
        try
        {
            switch (route = (char) System.in.read())
            {
                case 'M':
                case 'm': System.out.println("The trains going to Mumbai arrives at Platform no.5");
                break;

                case 'C':
                case 'c': System.out.println("The trains going to Chennai arrives at Platform no.3");
                break;

                case 'K':
                case 'k': System.out.println("The trains going to Kolkata arrives at Platform no.8");
                break;

                case 'B':
                case 'b': System.out.println("The trains going to Banglore arrives at Platform no.2");
                break;

                case 'V':
                case 'v': System.out.println("The trains going to Vishakapatnam arrives at Platform no.1");
                break;

                default: System.out.println("There are no trains to this route at the moment!!!");
            }
        }
        catch (Exception e){
            System.out.println("Input Error");
        }
    }
}

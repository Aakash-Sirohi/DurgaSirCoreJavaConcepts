public class EnumerationDemo {
    public enum Beer{
        KO,KF,RC,FO;

    }
    public static void main(String[] args) {
        Beer beer = Beer.RC;
        Beer[] b = beer.values();
        for(Beer b1 : b){
            System.out.println(b1);
        }
        switch (beer) {
            case KF:
                System.out.println("KF");
                break;
                case KO:
                    System.out.println("KO");
                    break;
                    case RC:
                        System.out.println("RC");
                        break;
                        case FO:
                            System.out.println("FO");
                            break;
                            default:
                                System.out.println("Unknown Beer");
        }
    }
}

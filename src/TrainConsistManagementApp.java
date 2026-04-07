public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("Train Consist Management App Started");
        
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";
        
        System.out.println("Searching for Bogie ID: " + searchKey);
        boolean found = searchBogie(bogies, searchKey);
        if (found) {
            System.out.println("Result: Bogie " + searchKey + " exists.");
        } else {
            System.out.println("Result: Bogie " + searchKey + " does not exist.");
        }
    }

    public static boolean searchBogie(String[] bogies, String searchKey) {
        if (bogies == null || searchKey == null) {
            return false;
        }
        for (String bogie : bogies) {
            if (searchKey.equals(bogie)) {
                return true;
            }
        }
        return false;
    }
}
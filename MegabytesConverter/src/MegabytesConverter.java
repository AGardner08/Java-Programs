public class MegabytesConverter {

    public static void printMegaByteAndKiloBytes (int kiloBytes) {

        //1 MB = 1024 KB
        int megabytes = 1024;
        int calculatedKiloBytes = kiloBytes / megabytes;

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {

            //Calculate the megabytes and remaining kilobytes
            int remainKilo = kiloBytes % 1024;


            //Format XX KB = YY MB and ZZ KB
            System.out.println(kiloBytes + " KB = " + calculatedKiloBytes + " MB and "
                    + remainKilo + " KB");

        }


    }
}

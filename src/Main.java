import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Harven harven = new Harven();
        do{
                double lat0 = Double.parseDouble(br.readLine());
                double long0 = Double.parseDouble(br.readLine());
                double lat1 = Double.parseDouble(br.readLine());
                double long1 = Double.parseDouble(br.readLine());
        System.out.println(String.format("%.6f", harven.calculateDistanceInKilometer(lat0, long0, lat1, long1)));
        }while (true);
    }
}


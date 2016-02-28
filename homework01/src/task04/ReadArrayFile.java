package task04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Julia on 27.02.2016.
 */
public final class ReadArrayFile {

    private final static String path = "C:\\Users\\Julia\\IdeaProjects\\com.epam.course.jf.task\\homework01\\src\\task04\\test";
    private final static int size = 10;

    public final double[] readArrayFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String sCurrentLine;
            int i = 0;
            double[] array = new double[size];
            while ((sCurrentLine = br.readLine()) != null) {
                array[i] = Double.parseDouble(sCurrentLine);
                System.out.println(array[i]);
                i++;
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
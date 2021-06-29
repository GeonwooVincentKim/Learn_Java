package Feature;

import java.util.Scanner;

public interface Files {
    public Scanner readFile(String fileName);

    public void writeFile(String result, String fileName);
}

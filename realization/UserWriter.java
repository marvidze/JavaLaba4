package realization;

import java.io.FileWriter;
import java.io.IOException;

public class UserWriter {

  /**
   * Конструктор по умолчанию для класса UserWriter
   */
  public UserWriter() {
  }

  /**
   * Метод для записи данных в файл
   * 
   * @param arrStrings массив строк с данными для записи в файл
   * @return true - метод отработал корректно | false - метод отработал
   *         некорректно
   */
  public static boolean WriteIntoFile(String[] arrStrings) {
    try (FileWriter writer = new FileWriter("InputInfoVector.txt", true)) {
      for (String str : arrStrings) {
        writer.write(str + '\n');
      }
      writer.flush();
      writer.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
      return false;
    }

    return true;
  }
}

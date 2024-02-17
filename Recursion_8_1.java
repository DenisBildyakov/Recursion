import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Recursion_8_1 {
    public static void main(String[] args) {
        // 8. Поиск всех файлов в заданном каталоге, включая файлы, расположенные в подкаталогах произвольной вложенности.
        List<String> list = findAllFiles("source");

        for (String path : list) {
            System.out.println(path);
        }
        System.out.println(list.size());
    }

    public static List<String> findAllFiles(String path) {
        List<String> pathsList = new ArrayList<>();
        File f = new File(path);
        String[] contents = f.list();
        for (int i = 0; i < contents.length; i++) {
            File tmpFile = new File(f.getAbsolutePath() + File.separator + contents[i]);
            String absolutePath = tmpFile.getAbsolutePath();
            if (tmpFile.isFile()) {
                pathsList.add(absolutePath);
            }
            if (tmpFile.isDirectory()) {
                pathsList.addAll(findAllFiles(absolutePath));
            }
        }
        return pathsList;
    }
}

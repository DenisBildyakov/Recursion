import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Recursion_8 {
    public static void main(String[] args) {
        // 8. Поиск всех файлов в заданном каталоге, включая файлы, расположенные в подкаталогах произвольной вложенности.
        List<String> list = findAllFiles("source");

        for (String path : list) {
            System.out.println(path);
        }
        System.out.println(list.size());
    }

    public static List<String> findAllFiles(String path) {
        List<String> list = new ArrayList<>();
        return findAllFiles_recursion(path, list);
    }

    public static List<String> findAllFiles_recursion(String path, List<String> pathsList) {
        File f = new File(path);
        String[] contents = f.list();
        for (int i = 0; i < contents.length; i++) {
            File tmpFile = new File(f.getAbsolutePath() + File.separator + contents[i]);
            String absolutePath = tmpFile.getAbsolutePath();
            if (tmpFile.isFile()) {
                pathsList.add(absolutePath);
            }
            if (tmpFile.isDirectory()) {
                findAllFiles_recursion(absolutePath, pathsList);
            }
        }
        return pathsList;
    }
}

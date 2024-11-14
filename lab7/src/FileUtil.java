public class FileUtil {
    public static String getFileNameWithExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}

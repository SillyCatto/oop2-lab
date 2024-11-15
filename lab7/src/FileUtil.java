public class FileUtil {
    public static String getFileExtension(String filePath) {
        if (filePath == null || filePath.isEmpty()) {
            return "";
        }

        int dotIndex = filePath.lastIndexOf('.');
        int lastSeparatorIndex = Math.max(filePath.lastIndexOf('/'), filePath.lastIndexOf('\\'));

        if (dotIndex > lastSeparatorIndex && dotIndex != -1) {
            return filePath.substring(dotIndex + 1);
        }
        return "";
    }
}
public class FileUtil {
    public static String getFileNameWithExtension(String filePath) {
        // Find the last occurrence of the file separator (either \ or /)
        int lastSeparatorIndex = Math.max(filePath.lastIndexOf('/'), filePath.lastIndexOf('\\'));

        if (lastSeparatorIndex != -1 && lastSeparatorIndex < filePath.length() - 1) {
            return filePath.substring(lastSeparatorIndex + 1);
        }

        return filePath;
    }
}

public class ReaderFactory {
    public static IUserReader createReader(String filePath) {
        String fileName = FileUtil.getFileNameWithExtension(filePath);

        return switch (fileName.toLowerCase()) {
            case "admin.csv" -> new AdminCSVReader();
            case "user.csv" -> new UserCSVReader();
            default -> {
                System.err.println("[ERROR] invalid file extension.");
                yield null;
            }
        };
    }
}

public class ReaderFactory {
    public static IUserReader createReader(String filePath) {
        String fileExt = FileUtil.getFileExtension(filePath);

        return switch (fileExt.toLowerCase()) {
            case "csv" -> new CSVReader(filePath);
            default -> {
                System.err.println("[ERROR] invalid file extension.");
                yield null;
            }
        };
    }
}

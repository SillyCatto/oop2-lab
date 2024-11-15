public class WriterFactory {
    public static IUserWriter createWriter(String fileName) {
        String fileExt = FileUtil.getFileExtension(fileName);

        return switch (fileExt.toLowerCase()) {
            case "csv" -> new CSVWriter(fileName);
            default -> {
                System.err.println("[ERROR] invalid file extension.");
                yield null;
            }
        };
    }
}


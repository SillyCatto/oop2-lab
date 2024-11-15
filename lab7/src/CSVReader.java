import java.util.ArrayList;

public class CSVReader implements IUserReader{
    private final String filePath;

    public CSVReader(String filePath) {
        this.filePath = filePath;
    }
    @Override
    public ArrayList<String[]> readUser() {
        return null;
    }
}

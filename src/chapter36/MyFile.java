package chapter36;

import java.util.List;

public class MyFile {
    private String fileName;
    private List<MyFile> files;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<MyFile> getFiles() {
        return files;
    }

    public void setFiles(List<MyFile> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "MyFile{" +
                "fileName='" + fileName + '\'' +
                ", files=" + files +
                '}';
    }
}

package br.com.rlourenco1998.data.dto;

import java.io.Serializable;
import java.util.Objects;

public class UploadFileResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private Long size;

    public UploadFileResponseDTO(){}

    public UploadFileResponseDTO(String fileName, String fileDownloadUri, Long size, String fileType) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.size = size;
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UploadFileResponseDTO that = (UploadFileResponseDTO) o;
        return Objects.equals(fileName, that.fileName) && Objects.equals(fileDownloadUri, that.fileDownloadUri) && Objects.equals(fileType, that.fileType) && Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileDownloadUri, fileType, size);
    }
}

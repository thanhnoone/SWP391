//package com.example.service;
//
//import com.google.cloud.storage.Blob;
//import com.google.cloud.storage.BlobId;
//import com.google.cloud.storage.BlobInfo;
//import com.google.cloud.storage.Storage;
//import com.google.cloud.storage.StorageOptions;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;  
//
//import java.io.IOException;
//
//@Service
//public class StorageService {
//
//    private final Storage storage = StorageOptions.getDefaultInstance().getService();
//    private final String bucketName = "swp391_de17d01";
//
//    public String uploadFile(MultipartFile file, String destinationBlobName) throws IOException {
//        BlobId blobId = BlobId.of(bucketName, destinationBlobName);
//        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType(file.getContentType()).build();
//        Blob blob = storage.create(blobInfo, file.getBytes());
//
//        return blob.getMediaLink();
//    }
//}

package com.example.finalproject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Main extends Application {
    public void start(Stage primaryStage) {
        try {
            MainUI root = new MainUI("");
            Scene scene = new Scene(root,600,500);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    class MainUI extends AnchorPane {

        private String mainid;
        public String getMainid() {
            return mainid;
        }
        public void setMainid(String mainid) {
            this.mainid = mainid;
        }ImageView imgView= new ImageView();
        public MainUI(String param) {
            this.mainid=param;
            Label label_5503694=new Label("转换格式");
            label_5503694.setFont(new Font("宋体", 14));
            label_5503694.setPrefWidth(Double.valueOf(100));
            label_5503694.setPrefHeight(Double.valueOf(23));
            this.setLeftAnchor(label_5503694, Double.valueOf(222));
            this.setTopAnchor(label_5503694, Double.valueOf(265));
            this.getChildren().add(label_5503694);
            Label pathLbl=new Label("原图片路径");
            pathLbl.setFont(new Font("宋体", 14));
            pathLbl.setPrefWidth(Double.valueOf(100));
            pathLbl.setPrefHeight(Double.valueOf(23));
            this.setLeftAnchor(pathLbl, Double.valueOf(109));
            this.setTopAnchor(pathLbl, Double.valueOf(191));
            this.getChildren().add(pathLbl);
            Label sizeLbl=new Label("");
            sizeLbl.setFont(new Font("宋体", 14));
            sizeLbl.setPrefWidth(Double.valueOf(100));
            sizeLbl.setPrefHeight(Double.valueOf(23));
            this.setLeftAnchor(sizeLbl, Double.valueOf(101));
            this.setTopAnchor(sizeLbl, Double.valueOf(386));
            this.getChildren().add(sizeLbl);
            ComboBox<String> formatCombox = new ComboBox<>();
            formatCombox.setPrefWidth(Double.valueOf(93));
            formatCombox.setPrefHeight(Double.valueOf(23));
            this.setLeftAnchor(formatCombox, Double.valueOf(307));
            this.setTopAnchor(formatCombox, Double.valueOf(265));
            formatCombox.getItems().add("jpg");
            formatCombox.getItems().add("jpeg");
            formatCombox.getItems().add("png");
            formatCombox.getItems().add("bmp");
            this.getChildren().add(formatCombox);
            Label label_11723462=new Label("图片转换工具");
            label_11723462.setFont(new Font("楷体", 24));
            label_11723462.setPrefWidth(Double.valueOf(300));
            label_11723462.setPrefHeight(Double.valueOf(40));
            this.setLeftAnchor(label_11723462, Double.valueOf(236));
            this.setTopAnchor(label_11723462, Double.valueOf(95));
            this.getChildren().add(label_11723462);
            TextField fromPathText = new TextField();
            fromPathText.setFont(new Font("宋体", 14));
            fromPathText.setPrefWidth(Double.valueOf(180));
            fromPathText.setPrefHeight(Double.valueOf(23));
            this.setLeftAnchor(fromPathText, Double.valueOf(226));
            this.setTopAnchor(fromPathText, Double.valueOf(193));
            this.getChildren().add(fromPathText);
            Button uploadBtn=new Button("上传");
            uploadBtn.setFont(new Font("宋体", 14));
            uploadBtn.setPrefWidth(Double.valueOf(93));
            uploadBtn.setPrefHeight(Double.valueOf(23));
            this.setLeftAnchor(uploadBtn, Double.valueOf(438));
            this.setTopAnchor(uploadBtn, Double.valueOf(193));
            //上传事件
            uploadBtn.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    FileChooser fileChooser = new FileChooser();
                    File selectedFile = fileChooser.showOpenDialog(((Stage) ((Button)event.getSource()).getScene().getWindow()));
                    if(selectedFile!=null){
                        fromPathText.setText(selectedFile.getAbsolutePath());
                        imgView.setImage(new Image("file:/"+fromPathText.getText()));
                        try {
                            FileImageInputStream fiis = new FileImageInputStream(new File(
                                    fromPathText.getText()));
                            Iterator<ImageReader> it1 = ImageIO.getImageReadersByFormatName(getExtension(fromPathText.getText()));
                            ImageReader jpegReader = null;
                            if (it1.hasNext()) {
                                jpegReader = it1.next();
                            }
                            jpegReader.setInput(fiis);
                            BufferedImage br = jpegReader.read(0);
                            sizeLbl.setText(br.getWidth()+"*"+br.getHeight());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        showMsg("上传成功");
                    }
                }
            });
            this.getChildren().add(uploadBtn);
            Button transformBtn=new Button("转换");
            transformBtn.setOnAction(e->{
                imgTransform(fromPathText.getText(), "temp."+formatCombox.getSelectionModel().getSelectedItem());
                showMsg("转换成功");
            });
            transformBtn.setFont(new Font("宋体", 14));
            transformBtn.setPrefWidth(Double.valueOf(93));
            transformBtn.setPrefHeight(Double.valueOf(23));
            this.setLeftAnchor(transformBtn, Double.valueOf(440));
            this.setTopAnchor(transformBtn, Double.valueOf(264));
            this.getChildren().add(transformBtn);

            imgView.setFitWidth(100);
            imgView.setFitHeight(100);
            this.setLeftAnchor(imgView, Double.valueOf(78));
            this.setTopAnchor(imgView, Double.valueOf(258));
            this.getChildren().add(imgView);
            Button downloadBtn=new Button("下载");
            downloadBtn.setOnAction(e->{
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("文件另存为");
                String suffix=formatCombox.getSelectionModel().getSelectedItem();
                fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(suffix, "."+suffix));

                File file=fileChooser.showSaveDialog(new Stage());
                if(file!=null){
                    try {
                        copyFileUsingStream(new File("temp."+formatCombox.getSelectionModel().getSelectedItem()), file);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                    showMsg("下载成功");
                }
            });
            downloadBtn.setFont(new Font("宋体", 14));
            downloadBtn.setPrefWidth(Double.valueOf(93));
            downloadBtn.setPrefHeight(Double.valueOf(23));
            this.setLeftAnchor(downloadBtn, Double.valueOf(440));
            this.setTopAnchor(downloadBtn, Double.valueOf(324));
            this.getChildren().add(downloadBtn);

        }
        public void imgTransform(String from,String to){
            try {
                FileImageInputStream fiis = new FileImageInputStream(new File(
                        from));
                FileImageOutputStream fios = new FileImageOutputStream(new File(
                        to));

                ImageReader jpegReader = null;
                Iterator<ImageReader> it1 = ImageIO.getImageReadersByFormatName(getExtension(from));
                if (it1.hasNext()) {
                    jpegReader = it1.next();
                }
                jpegReader.setInput(fiis);
                ImageWriter bmpWriter = null;
                Iterator<ImageWriter> it2 = ImageIO.getImageWritersByFormatName(getExtension(to));
                if (it2.hasNext()) {
                    bmpWriter = it2.next();
                }
                bmpWriter.setOutput(fios);
                BufferedImage br = jpegReader.read(0);
                bmpWriter.write(br);
                fiis.close();
                fios.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        public String getExtension(String fileName){
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        }
        private  void copyFileUsingStream(File source, File dest) throws IOException {
            InputStream is = null;
            OutputStream os = null;
            try {
                is = new FileInputStream(source);
                os = new FileOutputStream(dest);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            } finally {
                is.close();
                os.close();
            }
        }
        public void showMsg(String msg){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.titleProperty().set("提示");
            alert.headerTextProperty().set(msg);
            alert.showAndWait();
        }
    }
}
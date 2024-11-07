module edu.syslocacar {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires jdk.compiler;


    opens edu.syslocacar.controller to javafx.fxml;
    exports edu.syslocacar;
    exports edu.syslocacar.model.services;
    exports edu.syslocacar.model.entity;

    exports edu.syslocacar.controller to javafx.fxml;
}
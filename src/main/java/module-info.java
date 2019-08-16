/**
 * @project Scripter
 * @author n2god on 16/08/2019
 */module Scripter {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires javafx.controls;
    requires java.scripting;
    requires javafx.media;

    exports pl.n2god.fxbrowser to javafx.graphics;
    exports pl.n2god.fx_mediaplayer.main to javafx.graphics;
    opens pl.n2god.fx_mediaplayer.controller to javafx.fxml;
    opens pl.n2god.fxbrowser to javafx.fxml;
}
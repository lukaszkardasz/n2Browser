/**
 * @project Scripter
 * @author n2god on 16/08/2019
 */module Scripter {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires javafx.controls;
    requires java.scripting;

    exports pl.n2god.fxbrowser to javafx.graphics;
    opens pl.n2god.fxbrowser to javafx.fxml;
}
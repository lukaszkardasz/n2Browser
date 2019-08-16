package pl.n2god.fx_mediaplayer.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MediaController {

    @FXML
    private MediaView mediaView;

    @FXML
    private ToggleButton playPauseButton;

    public void initialize() {
        Media media = new Media("https://sample-videos.com/video123/mp4/240/big_buck_bunny_240p_1mb.mp4");
        MediaPlayer player = new MediaPlayer(media);
        player.setAutoPlay(true);
        mediaView.setMediaPlayer(player);

        playPauseButton.setOnAction(x -> {
            if (!playPauseButton.isSelected() || player.getStatus() == MediaPlayer.Status.READY || player.getStatus() == MediaPlayer.Status.PAUSED){
                player.play();
                playPauseButton.setText("Pause");
            } else {
                player.pause();
                playPauseButton.setText("Play");
            }
        });
        player.setOnError(() -> System.out.println("Error: "+player.getError()));
        System.out.println(media.getDuration());
    }
}

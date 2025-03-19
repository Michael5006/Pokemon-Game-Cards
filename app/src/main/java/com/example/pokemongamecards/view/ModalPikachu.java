package com.example.pokemongamecards.view;

import android.app.Dialog;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.example.pokemongamecards.R;
import com.example.pokemongamecards.model.Pikachu;

public class ModalPikachu extends DialogFragment {

    private SoundPool soundPool;
    private int sonidoImpactrueno, sonidoPunioTrueno, sonidoAtaqueRayo;
    private MediaPlayer mediaPlayer; // Para el sonido de Pikachu al abrir el modal

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = new Dialog(requireContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.modal_pikachu);

        // Configuración del tamaño y posición del modal
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.setGravity(Gravity.CENTER);
        }

        // Reproducir sonido de Pikachu al abrir la carta
        mediaPlayer = MediaPlayer.create(requireContext(), R.raw.pikahello);
        mediaPlayer.start();

        // Configurar SoundPool para efectos de sonido
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(3)
                .setAudioAttributes(audioAttributes)
                .build();

        // Cargar los sonidos en memoria
        sonidoImpactrueno = soundPool.load(requireContext(), R.raw.impactrueno, 1);
        sonidoPunioTrueno = soundPool.load(requireContext(), R.raw.punotrueno, 1);
        sonidoAtaqueRayo = soundPool.load(requireContext(), R.raw.ataquerayo, 1);

        // Instancia de Pikachu
        Pikachu pikachu = new Pikachu(25, "Pikachu", 6.0, "Macho", "Temporada 1");

        // Configurar botones invisibles
        Button btnImpactrueno = dialog.findViewById(R.id.btn_impactrueno);
        Button btnPunioTrueno = dialog.findViewById(R.id.btn_punio_trueno);
        Button btnAtaqueRayo = dialog.findViewById(R.id.btn_ataque_rayo);

        // Asignar acciones mostrando el nuevo modal y reproduciendo el sonido
        btnImpactrueno.setOnClickListener(v -> {
            soundPool.play(sonidoImpactrueno, 1, 1, 0, 0, 1);
            mostrarModalAtaque(pikachu.atacarImpactrueno(), R.drawable.electro);
        });

        btnPunioTrueno.setOnClickListener(v -> {
            soundPool.play(sonidoPunioTrueno, 1, 1, 0, 0, 1);
            mostrarModalAtaque(pikachu.atacarPunioTrueno(), R.drawable.electro);
        });

        btnAtaqueRayo.setOnClickListener(v -> {
            soundPool.play(sonidoAtaqueRayo, 1, 1, 0, 0, 1);
            mostrarModalAtaque(pikachu.atacarRayo(), R.drawable.electro);
        });

        return dialog;
    }

    // Método para mostrar el nuevo modal de ataque
    private void mostrarModalAtaque(String ataque, int icono) {
        ModalAtaque modalAtaque = new ModalAtaque(ataque, icono);
        modalAtaque.show(getParentFragmentManager(), "modal_ataque");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // Liberar SoundPool
        if (soundPool != null) {
            soundPool.release();
            soundPool = null;
        }
        // Liberar MediaPlayer
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}

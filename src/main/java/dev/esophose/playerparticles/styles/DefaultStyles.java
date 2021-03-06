package dev.esophose.playerparticles.styles;

import dev.esophose.playerparticles.PlayerParticles;
import dev.esophose.playerparticles.manager.ParticleStyleManager;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

public class DefaultStyles {

    /**
     * All the styles that are available by default from this plugin
     */
    public static final ParticleStyle ARROWS = new ParticleStyleArrows();
    public static final ParticleStyle BATMAN = new ParticleStyleBatman();
    public static final ParticleStyle BEAM = new ParticleStyleBeam();
    public static final ParticleStyle BLOCKBREAK = new ParticleStyleBlockBreak();
    public static final ParticleStyle BLOCKPLACE = new ParticleStyleBlockPlace();
    public static final ParticleStyle CELEBRATION = new ParticleStyleCelebration();
    public static final ParticleStyle CHAINS = new ParticleStyleChains();
    public static final ParticleStyle COMPANION = new ParticleStyleCompanion();
    public static final ParticleStyle CUBE = new ParticleStyleCube();
    public static final ParticleStyle FEET = new ParticleStyleFeet();
    public static final ParticleStyle HALO = new ParticleStyleHalo();
    public static final ParticleStyle HURT = new ParticleStyleHurt();
    public static final ParticleStyle INVOCATION = new ParticleStyleInvocation();
    public static final ParticleStyle MOVE = new ParticleStyleMove();
    public static final ParticleStyle NORMAL = new ParticleStyleNormal();
    public static final ParticleStyle ORBIT = new ParticleStyleOrbit();
    public static final ParticleStyle OVERHEAD = new ParticleStyleOverhead();
    public static final ParticleStyle POINT = new ParticleStylePoint();
    public static final ParticleStyle POPPER = new ParticleStylePopper();
    public static final ParticleStyle PULSE = new ParticleStylePulse();
    public static final ParticleStyle QUADHELIX = new ParticleStyleQuadhelix();
    public static final ParticleStyle RINGS = new ParticleStyleRings();
    public static final ParticleStyle SPHERE = new ParticleStyleSphere();
    public static final ParticleStyle SPIN = new ParticleStyleSpin();
    public static final ParticleStyle SPIRAL = new ParticleStyleSpiral();
    public static final ParticleStyle SWORDS = new ParticleStyleSwords();
    public static final ParticleStyle THICK = new ParticleStyleThick();
    public static final ParticleStyle TWINS = new ParticleStyleTwins();
    public static final ParticleStyle VORTEX = new ParticleStyleVortex();
    public static final ParticleStyle WHIRL = new ParticleStyleWhirl();
    public static final ParticleStyle WHIRLWIND = new ParticleStyleWhirlwind();
    public static final ParticleStyle WINGS = new ParticleStyleWings();

    /**
     * Registers all the default styles to the ParticleStyleManager
     * Registered in alphabetical order
     *
     * @param particleStyleManager The ParticleStyleManager instance
     */
    public static void registerStyles(ParticleStyleManager particleStyleManager) {
        particleStyleManager.registerStyle(ARROWS);
        particleStyleManager.registerStyle(BATMAN);
        particleStyleManager.registerStyle(BEAM);
        particleStyleManager.registerEventStyle(BLOCKBREAK);
        particleStyleManager.registerEventStyle(BLOCKPLACE);
        particleStyleManager.registerStyle(CELEBRATION);
        particleStyleManager.registerStyle(CHAINS);
        particleStyleManager.registerStyle(COMPANION);
        particleStyleManager.registerStyle(CUBE);
        particleStyleManager.registerStyle(FEET);
        particleStyleManager.registerStyle(HALO);
        particleStyleManager.registerEventStyle(HURT);
        particleStyleManager.registerStyle(INVOCATION);
        particleStyleManager.registerEventStyle(MOVE);
        particleStyleManager.registerStyle(NORMAL);
        particleStyleManager.registerStyle(ORBIT);
        particleStyleManager.registerStyle(OVERHEAD);
        particleStyleManager.registerStyle(POINT);
        particleStyleManager.registerStyle(POPPER);
        particleStyleManager.registerStyle(PULSE);
        particleStyleManager.registerStyle(QUADHELIX);
        particleStyleManager.registerStyle(RINGS);
        particleStyleManager.registerStyle(SPHERE);
        particleStyleManager.registerStyle(SPIN);
        particleStyleManager.registerStyle(SPIRAL);
        particleStyleManager.registerEventStyle(SWORDS);
        particleStyleManager.registerStyle(THICK);
        particleStyleManager.registerStyle(TWINS);
        particleStyleManager.registerStyle(VORTEX);
        particleStyleManager.registerStyle(WHIRL);
        particleStyleManager.registerStyle(WHIRLWIND);
        particleStyleManager.registerStyle(WINGS);

        // Register their events
        PluginManager pluginManager = Bukkit.getPluginManager();
        PlayerParticles playerParticles = PlayerParticles.getInstance();
        pluginManager.registerEvents((Listener) ARROWS, playerParticles);
        pluginManager.registerEvents((Listener) BLOCKBREAK, playerParticles);
        pluginManager.registerEvents((Listener) BLOCKPLACE, playerParticles);
        pluginManager.registerEvents((Listener) HURT, playerParticles);
        pluginManager.registerEvents((Listener) MOVE, playerParticles);
        pluginManager.registerEvents((Listener) SWORDS, playerParticles);
    }

    /**
     * Reloads the settings for all default styles
     *
     * @param particleStyleManager The ParticleStyleManager instance
     */
    public static void reloadSettings(ParticleStyleManager particleStyleManager) {
        for (ParticleStyle style : particleStyleManager.getStylesWithDisabled())
            if (style instanceof DefaultParticleStyle)
                ((DefaultParticleStyle) style).loadSettings(true);
    }

}

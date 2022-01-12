/* colors.xml (app > res > values > colors.xml) */
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
    <color name="green">#1B5E20</color>
    <color name="green_dark">#003300</color>
    <color name="green_light">#A5D6A7</color>
    <color name="blue">#0288D1</color>
    <color name="blue_dark">#005B9F</color>
    <color name="blue_light">#81D4FA</color>
</resources>

/* values/themes.xml (app > res > values > themes > themes.xml) */
    <resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.TipTime" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/green</item>
        <item name="colorPrimaryVariant">@color/green_dark</item>
        <item name="colorOnPrimary">@color/white</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/blue</item>
        <item name="colorSecondaryVariant">@color/blue_dark</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor" tools:targetApi="l">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
    
    /* values-night/themes.xml (app > res > values > themes > themes.xml (night)) */
    <resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Application theme for dark theme. -->
    <style name="Theme.TipTime" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/green_light</item>
        <item name="colorPrimaryVariant">@color/green</item>
        <item name="colorOnPrimary">@color/black</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/blue_light</item>
        <item name="colorSecondaryVariant">@color/blue_light</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor" tools:targetApi="l">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>

# Android sound box sample
This project enables you to create easily your own sound box. 

# How does it work
Each ButtonView is associated to a sound named like its ``` android:id ```

# Create your own soundbox
It's pretty simple to add a new sound
  - create a ButtonView with an id
  - add a sound file into ẗhe raw folder named with the ButtonId

# Example
This project is a sound box based on a french tv show "Strip Tease".

```xml
<Button
    android:id="@+id/chante"
    android:layout_height="wrap_content"
    android:layout_width="wrap_content"
    android:layout_column="2"
    android:layout_row="2"
    android:layout_columnWeight="1"
    android:layout_rowWeight="1"
    android:layout_gravity="fill"
    android:text="@string/chante"
    android:background="@android:color/holo_blue_bright"
    android:onClick="launchSong"
    android:tag="@string/recherche_bergere"
/>
```

Then add the corresponding sound into the right folder 
```app/src/main/res/raw/chante.mp3```

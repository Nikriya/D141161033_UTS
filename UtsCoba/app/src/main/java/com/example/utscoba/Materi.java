package com.example.utscoba;

class Materi {

    // Member variables representing the title and information about the materi.
    private String title;
    private String info;
    private final int imageResource;

    /**
     * Constructor for the Materi data model.
     *
     * @param title The name if the materi.
     * @param info Information about the materi.
     */


    public Materi(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;

    }

    /**
     * Gets the title of the materi.
     *
     * @return The title of the materi.
     */
    String getTitle() {

        return title;
    }

    /**
     * Gets the info about the materi.
     *
     * @return The info about the materi.
     */
    String getInfo() {

        return info;
    }

    public int getImageResource() {

        return imageResource;
    }
}

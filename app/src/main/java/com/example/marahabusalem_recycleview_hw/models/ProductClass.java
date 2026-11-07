package com.example.marahabusalem_recycleview_hw.models;

    public class ProductClass {
        private int id;
        private int image;
        private String name;
        private String price;

        public ProductClass(int id, int image, String name, String price) {
            this.id = id;
            this.image = image;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public int getImage() {
            return image;
        }

        public String getName() {
            return name;
        }

        public String getPrice() {
            return price;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }


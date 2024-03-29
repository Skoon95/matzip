package dev.yhpark.matzip.entities;

import java.util.Objects;

public class ReviewImageEntity {
    private int index;
    private int reviewIndex;
    private byte[] data;
    private String dataType;

    public int getIndex() {
        return index;
    }

    public ReviewImageEntity setIndex(int index) {
        this.index = index;
        return this;
    }

    public int getReviewIndex() {
        return reviewIndex;
    }

    public ReviewImageEntity setReviewIndex(int reviewIndex) {
        this.reviewIndex = reviewIndex;
        return this;
    }

    public byte[] getData() {
        return data;
    }

    public ReviewImageEntity setData(byte[] data) {
        this.data = data;
        return this;
    }

    public String getDataType() {
        return dataType;
    }

    public ReviewImageEntity setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewImageEntity that = (ReviewImageEntity) o;
        return index == that.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
}
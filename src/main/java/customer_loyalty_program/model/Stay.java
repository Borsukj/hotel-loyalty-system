package customer_loyalty_program.model;

import java.time.LocalDate;

public class Stay {

    private Long id;
    private Long memberId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String roomType;
    private Double totalAmount;
    private int pointsEarned;


    //constructs
    public Stay(int pointsEarned, Double totalAmount, String roomType, LocalDate checkOutDate, LocalDate checkInDate, Long memberId, Long id) {
        this.pointsEarned = pointsEarned;
        this.totalAmount = totalAmount;
        this.roomType = roomType;
        this.checkOutDate = checkOutDate;
        this.checkInDate = checkInDate;
        this.memberId = memberId;
        this.id = id;
    }

    //getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
}

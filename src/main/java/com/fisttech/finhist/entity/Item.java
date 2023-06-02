package com.fisttech.finhist.entity;

import com.fisttech.finhist.model.Auditable;
import com.fisttech.finhist.model.Currency;
import com.fisttech.finhist.model.ItemType;
import com.fisttech.finhist.model.QuantityType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NonNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Item extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean physical = false;

    @Enumerated(EnumType.STRING)
    private ItemType type;

    private BigDecimal quantity;

    @Enumerated(EnumType.STRING)
    private QuantityType quantityType;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Currency currency = Currency.TRY;

    private BigDecimal additionalAmount; // // TODO: ? tax?

    private BigDecimal totalAmount; // TODO: ? amount + tax + whatever?

    @NonNull
    private String description;

    private LocalDateTime transactionDate = LocalDateTime.now();

//
//    @Column(name = "created_date")
//    @CreatedDate
//    private String createdDate;
//
//    @Column(name = "last_modified_date")
//    @LastModifiedDate
//    private LocalDateTime lastModifiedDate;

    /////////////

    public Item() {
    }

    public Long getId() {
        return id;
    }

//    @Override
//    public boolean isNew() {
//        return false;
//    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getPhysical() {
        return physical;
    }

    public void setPhysical(Boolean physical) {
        this.physical = physical;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public QuantityType getQuantityType() {
        return quantityType;
    }

    public void setQuantityType(QuantityType quantityType) {
        this.quantityType = quantityType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getAdditionalAmount() {
        return additionalAmount;
    }

    public void setAdditionalAmount(BigDecimal additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Item(Long id, ItemType itemType, Boolean physical, BigDecimal quantity, QuantityType quantityType, BigDecimal amount, Currency currency, BigDecimal additionalAmount, BigDecimal totalAmount, @NonNull String description, LocalDateTime transactionDate) {
        this.id = id;
        this.type = itemType;
        this.physical = physical;
        this.quantity = quantity;
        this.quantityType = quantityType;
        this.amount = amount;
        this.currency = currency;
        this.additionalAmount = additionalAmount;
        this.totalAmount = totalAmount;
        this.description = description;
        this.transactionDate = transactionDate;
    }

//    @Override
//    public Optional getCreatedBy() {
//        return Optional.empty();
//    }
//
//    @Override
//    public void setCreatedBy(Object createdBy) {
//
//    }
//
//    @Override
//    public Optional getCreatedDate() {
//        return Optional.empty();
//    }
//
//    @Override
//    public void setCreatedDate(TemporalAccessor creationDate) {
//
//    }
//
//    @Override
//    public Optional getLastModifiedBy() {
//        return Optional.empty();
//    }
//
//    @Override
//    public void setLastModifiedBy(Object lastModifiedBy) {
//
//    }
//
//    @Override
//    public Optional getLastModifiedDate() {
//        return Optional.empty();
//    }
//
//    @Override
//    public void setLastModifiedDate(TemporalAccessor lastModifiedDate) {
//
//    }
}

package com.fisttech.finhist.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ItemModel {


        private Boolean physical = false;

        private ItemType type;

        private BigDecimal quantity;

        private QuantityType quantityType;

        private BigDecimal amount;

        private Currency currency = Currency.TRY;

        private BigDecimal additionalAmount; // // TODO: ? tax?

        private BigDecimal totalAmount; // TODO: ? amount + tax + whatever?

        private String description;

        private LocalDateTime transactionDate = LocalDateTime.now();

        public Boolean getPhysical() {
                return physical;
        }

        public ItemType getType() {
                return type;
        }

        public void setType(ItemType type) {
                this.type = type;
        }

        public void setPhysical(Boolean physical) {
                this.physical = physical;
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
}



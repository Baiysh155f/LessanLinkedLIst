import java.math.BigDecimal;
import java.util.Objects;

public class BanAccount {
    private String bankName;
    private String cardName;
    private BigDecimal pay;

    public BanAccount(String bankName, String cardName, BigDecimal pay) {
        this.bankName = bankName;
        this.cardName = cardName;
        this.pay = pay;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public BigDecimal getPay() {
        return pay;
    }

    public void setPay(BigDecimal pay) {
        this.pay = pay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BanAccount that = (BanAccount) o;
        return Objects.equals(bankName, that.bankName) && Objects.equals(cardName, that.cardName) && Objects.equals(pay, that.pay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, cardName, pay);
    }

    @Override
    public String toString() {
        return "BanAccount{" +
                "bankName='" + bankName + '\'' +
                ", cardName='" + cardName + '\'' +
                ", pay=" + pay +
                '}';
    }
}

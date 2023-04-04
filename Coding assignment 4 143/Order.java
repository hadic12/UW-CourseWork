public class Order
{
    private Money amount;
    private Date orderDate, sendDate = null;
    private String customer;
    private String item;

    public Order(Money amount, Date orderDate, String customer, String item){
        this.amount = amount;
        this.orderDate = orderDate;
        this.customer = customer; 
        this.item = item;
    }

    public Order(Order toCopy){
        //Copy from other object into this.
        amount = toCopy.amount;
        orderDate = toCopy.orderDate;
        sendDate = toCopy.sendDate;
        customer = toCopy.customer;
        item = toCopy.item;
    }

    public boolean isFulfilled(){
        return sendDate != null;
    }

    public boolean setFulfilled(Date sendDate){
        //First check date is after order date.
        if(sendDate.isAfter(orderDate))
        {
            this.sendDate = sendDate;
            return true;
        }

        return false;
    }

    public boolean setOrderDate(Date nextDate){
        //If order is already sent do not change.
        if(isFulfilled())
            return false;

        this.orderDate = nextDate;
        return true;
    }

    public boolean setSentDate(Date nextDate){
        //If order is already sent dont change.
        if(isFulfilled())
            return false;

        this.sendDate = nextDate;
        return true;
    }

    public boolean setAmount(Money amount){
        //If order is already sent dont change.
        if(isFulfilled())
            return false;

        this.amount = amount;
        return true;
    }

    public void setCustomer(String customer){
        this.customer = customer;
    }

    public Money getAmount(){ 
        return amount; 
    }

    public Date getOrderDate(){ 
        return orderDate; 
    }

    public String getCustomer(){ 
        return customer; 
    }

    public String getItem(){ 
        return item; 
    }

    //toString method of money and date class
    public String toString(){
        return "Item: " + item + " customer: " + customer 
        +  "  amount: " + amount.toString() + "  Ordered Date: " + orderDate.toString();
    }

    //Equals method
    public boolean equals(Object o){
        //first make sure object is of order class
        if(o instanceof Order)
        {
            Order other = (Order) o;

            //now use string, date, money class equals method to compare
            if(customer.equals(other.getCustomer()) && item.equals(other.getItem()) 
            && amount.equals(other.getAmount()) && orderDate.equals(other.getOrderDate()))
                return true;

            return false;
        }

        return false;
    }
}


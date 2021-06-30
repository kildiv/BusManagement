/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_management;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Kildi
 */
@Entity
@Table(name = "add_booking", catalog = "busmanagement", schema = "")
@NamedQueries({
    @NamedQuery(name = "AddBooking.findAll", query = "SELECT a FROM AddBooking a")
    , @NamedQuery(name = "AddBooking.findById", query = "SELECT a FROM AddBooking a WHERE a.id = :id")
    , @NamedQuery(name = "AddBooking.findByBusStart", query = "SELECT a FROM AddBooking a WHERE a.busStart = :busStart")
    , @NamedQuery(name = "AddBooking.findByBusDestination", query = "SELECT a FROM AddBooking a WHERE a.busDestination = :busDestination")
    , @NamedQuery(name = "AddBooking.findByPhoneNumber", query = "SELECT a FROM AddBooking a WHERE a.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "AddBooking.findByFirstName", query = "SELECT a FROM AddBooking a WHERE a.firstName = :firstName")
    , @NamedQuery(name = "AddBooking.findByLastName", query = "SELECT a FROM AddBooking a WHERE a.lastName = :lastName")
    , @NamedQuery(name = "AddBooking.findBySeats", query = "SELECT a FROM AddBooking a WHERE a.seats = :seats")})
public class AddBooking implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "bus_start")
    private String busStart;
    @Basic(optional = false)
    @Column(name = "bus_destination")
    private String busDestination;
    @Basic(optional = false)
    @Column(name = "phone_number")
    private int phoneNumber;
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "seats")
    private String seats;

    public AddBooking() {
    }

    public AddBooking(Integer id) {
        this.id = id;
    }

    public AddBooking(Integer id, String busStart, String busDestination, int phoneNumber, String firstName, String lastName, String seats) {
        this.id = id;
        this.busStart = busStart;
        this.busDestination = busDestination;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.seats = seats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBusStart() {
        return busStart;
    }

    public void setBusStart(String busStart) {
        String oldBusStart = this.busStart;
        this.busStart = busStart;
        changeSupport.firePropertyChange("busStart", oldBusStart, busStart);
    }

    public String getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(String busDestination) {
        String oldBusDestination = this.busDestination;
        this.busDestination = busDestination;
        changeSupport.firePropertyChange("busDestination", oldBusDestination, busDestination);
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        int oldPhoneNumber = this.phoneNumber;
        this.phoneNumber = phoneNumber;
        changeSupport.firePropertyChange("phoneNumber", oldPhoneNumber, phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        String oldSeats = this.seats;
        this.seats = seats;
        changeSupport.firePropertyChange("seats", oldSeats, seats);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddBooking)) {
            return false;
        }
        AddBooking other = (AddBooking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus_management.AddBooking[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

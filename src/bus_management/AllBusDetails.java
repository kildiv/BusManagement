/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_management;

/**
 *
 * @author Kildi
 */
public class AllBusDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form AllBusDetails
     */
    public AllBusDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("busmanagement?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        busDetailsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery.getResultList();
        busDetailsQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery1.getResultList();
        busDetailsQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery2.getResultList();
        busDetailsQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery3.getResultList();
        busDetailsQuery4 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery4.getResultList();
        busmanagementPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("busmanagement?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        busDetailsQuery5 = java.beans.Beans.isDesignTime() ? null : busmanagementPUEntityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery5.getResultList();
        busDetailsQuery6 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery6.getResultList();
        busDetailsQuery7 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList7 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery7.getResultList();
        busDetailsQuery8 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList8 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery8.getResultList();
        adminDetailsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM AdminDetails a");
        adminDetailsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : adminDetailsQuery.getResultList();
        busDetailsQuery9 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList9 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery9.getResultList();
        busDetailsQuery10 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList10 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery10.getResultList();
        busDetailsQuery11 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList11 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery11.getResultList();
        busDetailsQuery12 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList12 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery12.getResultList();
        busDetailsQuery13 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList13 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery13.getResultList();
        busDetailsQuery14 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList14 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery14.getResultList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setTitle("All Bus Details");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, busDetailsList14, jTable2);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${busDest}"));
        columnBinding.setColumnName("Bus Dest");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${busStart}"));
        columnBinding.setColumnName("Bus Start");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${busNo}"));
        columnBinding.setColumnName("Bus No");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<bus_management.AdminDetails> adminDetailsList;
    private javax.persistence.Query adminDetailsQuery;
    private java.util.List<bus_management.BusDetails> busDetailsList;
    private java.util.List<bus_management.BusDetails> busDetailsList1;
    private java.util.List<bus_management.BusDetails> busDetailsList10;
    private java.util.List<bus_management.BusDetails> busDetailsList11;
    private java.util.List<bus_management.BusDetails> busDetailsList12;
    private java.util.List<bus_management.BusDetails> busDetailsList13;
    private java.util.List<bus_management.BusDetails> busDetailsList14;
    private java.util.List<bus_management.BusDetails> busDetailsList2;
    private java.util.List<bus_management.BusDetails> busDetailsList3;
    private java.util.List<bus_management.BusDetails> busDetailsList4;
    private java.util.List<bus_management.BusDetails> busDetailsList5;
    private java.util.List<bus_management.BusDetails> busDetailsList6;
    private java.util.List<bus_management.BusDetails> busDetailsList7;
    private java.util.List<bus_management.BusDetails> busDetailsList8;
    private java.util.List<bus_management.BusDetails> busDetailsList9;
    private javax.persistence.Query busDetailsQuery;
    private javax.persistence.Query busDetailsQuery1;
    private javax.persistence.Query busDetailsQuery10;
    private javax.persistence.Query busDetailsQuery11;
    private javax.persistence.Query busDetailsQuery12;
    private javax.persistence.Query busDetailsQuery13;
    private javax.persistence.Query busDetailsQuery14;
    private javax.persistence.Query busDetailsQuery2;
    private javax.persistence.Query busDetailsQuery3;
    private javax.persistence.Query busDetailsQuery4;
    private javax.persistence.Query busDetailsQuery5;
    private javax.persistence.Query busDetailsQuery6;
    private javax.persistence.Query busDetailsQuery7;
    private javax.persistence.Query busDetailsQuery8;
    private javax.persistence.Query busDetailsQuery9;
    private javax.persistence.EntityManager busmanagementPUEntityManager;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

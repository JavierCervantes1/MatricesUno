/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jcervant23
 */
public class Helper {

    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String recibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void tablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static void limpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void diagonalSecundaria(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                aux = (int) tabla1.getValueAt(i, j);
                if (j == (nc - 1) - (i - 1 / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }

    }

    public static void triangularSuperior(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                aux = (int) tabla1.getValueAt(i, j);
                if (i == j || i < j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void triangularInferior(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                aux = (int) tabla1.getValueAt(i, j);
                if (j == i || j < i) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void matrizTraspuesta(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                aux = (int) tabla1.getValueAt(i, j);

                DefaultTableModel tm2 = (DefaultTableModel) tabla2.getModel();
                tm2.setRowCount(nc);
                tm2.setColumnCount(nf);

                tabla2.setValueAt(aux, j, i);

            }
        }
    }

    public static void letraA(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (j == 0 || i == 0 || j == nc - 1 || i == (nf) / 2) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }
                    }
    }

    public static void letraZ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (i == 0 || i == nf - 1 || j == (nc - 1) - (i - 1 / 2)) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }
                    }
    }

    public static void letraT(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (i == 0 || j == (nc - 1) / 2) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }

                    }
    }

    public static void letraV(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (j == nc + ((nc) / 2) - (i + 1) || i == ((nf - 1) / 2) + j) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }
                    }
    }

    public static void letraE(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (j == 0 || i == 0 || i == (nf - 1) / 2 || i == nf - 1) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }

                    }
    }

    public static void letraF(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (i == 0 || j == 0 || i == (nf - 1) / 2) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }

                    }
    }

    public static void letraP(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (i == 0 || j == 0 || i == (nf - 1) / 2 || j == nc - 1 && j / i >= 2) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }

                    }
    }

    public static void letraI(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (j == (nc - 1) / 2) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }

                    }
    }

    public static void letraN(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (j == 0 || j == nc - 1 || i == j) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }

                    }
    }

    public static void letraY(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);

                            if (j == nc / 2 && j <= i || i + j == nf - 1 && i <= j || i == j && i + j <= nf) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }

                    }
    }

    public static void letraX(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
                        for (int j = 0; j < nc; j++) {
                            aux = (int) tabla1.getValueAt(i, j);
                            if (j == i || j == nc - 1 - i) {
                                tabla2.setValueAt(aux, i, j);
                            }
                        }

                    }
    }

}

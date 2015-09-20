package com.transmetro.estructuras;

import com.transmetro.manejador.ManejadorClases;

public class ArbolAVL {
	public nodoArbolAVL raiz;
    public static String code;
    public static String code2;
    public int cNodos;
    public ArbolAVL()
    {
        this.raiz = null;
        ArbolAVL.code = "";
    }

    public boolean esVacio()
    {
        return (raiz == null);
    }

    public void insertar(Informacion user)
    {
        if (esVacio())
        {
            nodoArbolAVL nuevo = new nodoArbolAVL(user);
            nuevo.hd = new ArbolAVL();
            nuevo.hi = new ArbolAVL();
            raiz = nuevo;
        }
        else
        {
            if (user.getComparable().compareTo(raiz.dato.getComparable()) < 0)
            {
                (raiz.hi).insertar(user);

            }
            else if (user.getComparable().compareTo(raiz.dato.getComparable()) > 0)
            {
                (raiz.hd).insertar(user);

            }
        }
        cNodos++;
        actualizarFE();
    }
    
    public void preOrden()
    {
        if (!esVacio())
        {
            System.out.println(raiz.dato.getComparable() + ", ");
            raiz.hi.preOrden();
            raiz.hd.preOrden();
        }
    }
    
    public String setDatos(){
    	/*if (!esVacio())
        {
    		String data = raiz.dato.getChofer().getClave() + "," + raiz.dato.getChofer().getNombre() + "," + raiz.dato.getChofer().getApellido() + "\n";
    		ManejadorClases.getInstancia().setResChofer(ManejadorClases.getInstancia().getResChofer() + data);
    		raiz.hi.setDatos();
    		raiz.hd.setDatos();
        }*/
    	if (esVacio())
        {
            return "";
        }
        else
        {
        	String data = raiz.dato.getChofer().getClave() + "," + raiz.dato.getChofer().getNombre() + "," + raiz.dato.getChofer().getApellido() + "\n";
            return (data + raiz.hd.setDatos() + raiz.hi.setDatos());
        }
    	
    }
    
    public void inOrden()
    {
        if (!esVacio())
        {
            raiz.hi.inOrden();
            System.out.println(raiz.dato.getComparable() + ", ");
            raiz.hd.inOrden();
        }
    }

    public void postOrden()
    {
        if (!esVacio())
        {
            raiz.hi.postOrden();
            raiz.hd.postOrden();
            System.out.println(raiz.dato.getComparable() + ", ");

        }
    }

    public ArbolAVL buscar(String correo)
    {
        ArbolAVL arbolito = null;
        if (!esVacio())
        {
            if (correo.equals(raiz.dato.getComparable()))
            {
                return this;
            }
            else
            {
                if (correo.compareTo(raiz.dato.getComparable()) < 0)
                {
                    arbolito = raiz.hi.buscar(correo);
                }
                else if (correo.compareTo(raiz.dato.getComparable()) > 0)
                {
                    arbolito = raiz.hd.buscar(correo);
                }
            }
        }
        return arbolito;
    }

    public boolean editar(String nick, String newNick, String newPass, String newCorreo)
    {
        nodoArbolAVL encontrado = buscar(nick).raiz;
        nodoArbolAVL verficar = null;
        try
        {
            verficar = buscar(newNick).raiz;
        }
        catch (Exception ews) { }

        if (verficar == null)
        {
            encontrado.dato.setCorreo(newCorreo);
            //encontrado.dato.pass = newPass;
            //encontrado.dato.correo = newCorreo;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean existe(String correo)
    {
        if (!esVacio())
        {
            if (correo.equals(raiz.dato.getComparable()))
            {
                return true;
            }
            else
            {
                if (correo.compareTo(raiz.dato.getComparable()) < 0)
                {
                    raiz.hi.existe(correo);
                }
                else if (correo.compareTo(raiz.dato.getComparable()) > 0)
                {
                    raiz.hd.existe(correo);
                }
            }
        }
        return false;
    }

    public int cantidad()
    {
        if (esVacio())
        {
            return 0;
        }
        else
        {
            return (1 + raiz.hd.cantidad() + raiz.hi.cantidad());
        }
    }

    public int altura()
    {
        if (esVacio())
        {
            return 0;
        }
        else
        {
            return (1 + Math.max(((raiz.hi).altura()), ((raiz.hd).altura())));
        }
    }

    public Informacion buscarMin()
    {
        ArbolAVL arbolActual = this;
        while (!arbolActual.raiz.hi.esVacio())
        {
            arbolActual = arbolActual.raiz.hi;
        }
        Informacion devuelvo = arbolActual.raiz.dato;
        arbolActual.raiz = null;
        return devuelvo;
    }

    public Informacion buscarMan()
    {
        ArbolAVL arbolActual = this;
        while (!arbolActual.raiz.hd.esVacio())
        {
            arbolActual = arbolActual.raiz.hd;
        }
        Informacion devuelvo = arbolActual.raiz.dato;
        arbolActual.raiz = null;
        return devuelvo;
    }

    public boolean esHoja()
    {
        boolean hoja = false;
        if ((raiz.hi).esVacio() && (raiz.hd).esVacio())
        {
            hoja = true;
        }
        return hoja;
    }

    public void eliminar(String correo)
    {
        ArbolAVL paraEliminar = buscar(correo);
        if (!paraEliminar.esVacio())
        {
            if (paraEliminar.esHoja())
            {
                paraEliminar.raiz = null;
            }
            else
            {
                if (!paraEliminar.raiz.hi.esVacio() && !paraEliminar.raiz.hd.esVacio())
                {
                    paraEliminar.raiz.dato = paraEliminar.raiz.hd.buscarMin();
                }
                else
                {
                    if (paraEliminar.raiz.hi.esVacio())
                    {
                        paraEliminar.raiz = paraEliminar.raiz.hd.raiz;
                    }
                    else
                    {
                        paraEliminar.raiz = paraEliminar.raiz.hi.raiz;
                    }
                }
            }

            actualizarFE();
        }
    }

    public int nodosHoja()
    {
        if (raiz != null)
        {
            if (esHoja())
            {
                return 1;
            }
            else
            {
                return ((raiz.hi).nodosHoja() + (raiz.hd).nodosHoja());
            }
        }
        else
        {
            return 0;
        }
    }

    public int nodosRama()
    {
        return (cantidad() - nodosHoja() - 1);
    }

    public int niveles()
    {
        return (altura() - 1);
    }

    public void CodGraphviz()
    {
        if (!esVacio())
        {
            if (raiz.hi.raiz != null && raiz.hd.raiz != null)
            {
                code = code + raiz.data;
                code = code + raiz.hi.raiz.data;
                code = code + raiz.hd.raiz.data;

                code = code + raiz.nombre + ":iz" + " -> " + raiz.hi.raiz.nombre + ":c" + ";\n";
                code = code + raiz.nombre + ":de" + " -> " + raiz.hd.raiz.nombre + ":c" + ";\n";
            }
            else if (raiz.hi.raiz != null || raiz.hd.raiz != null)
            {
                if (raiz.hi.raiz == null && raiz.hd.raiz != null)
                {
                    code = code + raiz.data;
                    code = code + raiz.nombre + "Invisible" + "[ style=invis ];\n";
                    code = code + raiz.hd.raiz.data;

                    code = code + raiz.nombre + ":iz" + " -> " + raiz.nombre + "Invisible" + ":c" + "[color=white]" + ";\n";
                    code = code + raiz.nombre + ":de" + " -> " + raiz.hd.raiz.nombre + ":c" + ";\n";
                }

                if (raiz.hd.raiz == null && raiz.hi.raiz != null)
                {
                    code = code + raiz.data;
                    code = code + raiz.hi.raiz.data;
                    code = code + raiz.nombre + "Invisible" + "[ style=invis ];\n";

                    code = code + raiz.nombre + ":iz" + " -> " + raiz.hi.raiz.nombre + ":c" + ";\n";
                    code = code + raiz.nombre + ":de" + " -> " + raiz.nombre + "Invisible" + ":c" + "[color=white]" + ";\n";
                }

            }

            raiz.hi.CodGraphviz();
            raiz.hd.CodGraphviz();

        }

    }

    public void actualizarFE()
    {
        if (!esVacio())
        {
            raiz.hi.actualizarFE();
            raiz.hd.actualizarFE();
            raiz.fe = (raiz.hd.altura()) - (raiz.hi.altura());
            raiz.data = raiz.nombre + "[ label = " + "\"" + "<iz> |<c> " + raiz.dato.getComparable() + "[" + raiz.fe + "]" + "| <de>" + "\"" + " ];\n";

            if (raiz.fe == 2)
            {
                nodoArbolAVL n = raiz;
                nodoArbolAVL n1 = raiz.hd.raiz;

                if (n1.fe >= 0)
                    raiz = RotateRR(raiz);
                else if (n1.fe == -1)
                    raiz = RotateRL(raiz);

                actualizarFE();

            }
            else if (raiz.fe == -2)
            {
                nodoArbolAVL n = raiz;
                nodoArbolAVL n1 = raiz.hi.raiz;

                if (n1.fe <= 0)
                    raiz = RotateLL(raiz);
                else if (n1.fe == 1)
                    raiz = RotateLR(raiz);

                actualizarFE();

            }
        }
    }

    private nodoArbolAVL RotateLL(nodoArbolAVL parent)
    {
        nodoArbolAVL pivot = parent.hi.raiz;
        parent.hi.raiz = pivot.hd.raiz;
        pivot.hd.raiz = parent;
        return pivot;
    }

    private nodoArbolAVL RotateLR(nodoArbolAVL parent)
    {
        nodoArbolAVL pivot = parent.hi.raiz;
        parent.hi.raiz = RotateRR(pivot);
        return RotateLL(parent);
    }

    private nodoArbolAVL RotateRR(nodoArbolAVL parent)
    {
        nodoArbolAVL pivot = parent.hd.raiz;
        parent.hd.raiz = pivot.hi.raiz;
        pivot.hi.raiz = parent;
        return pivot;
    }

    private nodoArbolAVL RotateRL(nodoArbolAVL parent)
    {
        nodoArbolAVL pivot = parent.hd.raiz;
        parent.hd.raiz = RotateLL(pivot);
        return RotateRR(parent);
    }

}
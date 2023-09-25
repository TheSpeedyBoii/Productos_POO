public class cls_productos{
    private String str_codigo;
    private String str_nombre;
    private String str_descripcion;
    private int int_stock;
    private float flt_valorCompra;
    private float flt_ganancia;
    private float flt_valorVenta;

    public cls_productos(String cod, String nom, String des, int stock, float val_c, float ganancia){
        this.str_codigo = cod;
        this.str_nombre = nom;
        this.str_descripcion = des;
        this.int_stock = stock;
        this.flt_valorCompra = val_c;
        this.flt_ganancia = ganancia;
        this.flt_valorVenta = (flt_valorCompra * ganancia) + flt_valorCompra;

    }

    public void setNombre(String nombre) {this.str_nombre = nombre;}
    public void setDescripcion(String descripcion) {this.str_descripcion = descripcion;}

    public String getNombre() {return str_nombre;}
    public String getDescripcion() {return str_descripcion;}
    public String getCodigo() {return str_codigo;}
    public int getStock() {return int_stock;}
    public float getValorCompra() {return flt_valorCompra;}
    public float getGanancia() {return flt_ganancia;}
    public float getValorVenta() {return flt_valorVenta;}
}
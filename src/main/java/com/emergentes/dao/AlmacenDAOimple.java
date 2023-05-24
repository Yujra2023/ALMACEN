package com.emergentes.dao;

import com.emergentes.modelo.Almacen;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlmacenDAOimple extends ConexionDB implements AlmacenDAO {

    @Override
    public void insert(Almacen almacen) throws Exception {

        try {
            this.conectar();
            String sql = "INSERT INTO almacenes(cantidad,descripcion,precio,categoria) values (?,?,?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, almacen.getCantidad());
            ps.setString(2, almacen.getDescripcion());
            ps.setFloat(3, almacen.getPrecio());
            ps.setString(4, almacen.getCategoria());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }

    }

    @Override
    public void update(Almacen almacen) throws Exception {

        try {
            this.conectar();
            String sql = "UPDATE almacenes SET cantidad=? ,descripcion=?, precio=?, categoria=? WHERE id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, almacen.getCantidad());
            ps.setString(2, almacen.getDescripcion());
            ps.setFloat(3, almacen.getPrecio());
            ps.setString(4, almacen.getCategoria());
            ps.setInt(5, almacen.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id) throws Exception {

        try {
            this.conectar();
            String sql = "DELETE FROM almacenes WHERE id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }

    }

    @Override
    public Almacen getById(int id) throws Exception {

        Almacen avi = new Almacen();
        try {
            this.conectar();
            String sql = "SELECT * FROM almacenes WHERE id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                avi.setId(rs.getInt("id"));
                avi.setCantidad(rs.getInt("cantidad"));
                avi.setDescripcion(rs.getString("descripcion"));
                avi.setPrecio(rs.getFloat("precio"));
                avi.setCategoria(rs.getString("categoria"));
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return avi;

    }

    @Override
    public List<Almacen> getAll() throws Exception {
        ArrayList<Almacen> lista = new ArrayList<Almacen>();
        try {

            this.conectar();
            String sql = "SELECT * FROM almacenes ";
            PreparedStatement ps = this.conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Almacen avi = new Almacen();
                avi.setId(rs.getInt("id"));
                avi.setCantidad(rs.getInt("cantidad"));
                avi.setDescripcion(rs.getString("descripcion"));
                avi.setPrecio(rs.getFloat("precio"));
                avi.setCategoria(rs.getString("categoria"));

                lista.add(avi);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }
}

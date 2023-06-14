package org.bedu.postwork_7.controllers;

import org.bedu.postwork_7.dto.venta.Venta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @GetMapping("/{ventaId}")
    public ResponseEntity<Venta> getVenta(@PathVariable Long ventaId) {
        return ResponseEntity.ok(Venta.builder().build());
    }

    @GetMapping
    public ResponseEntity<List<Venta>> getVentas(@RequestParam Long clienteId) {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<Void> creaVenta(@RequestBody Venta venta, @RequestParam Long clienteId) {
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{ventaId}")
    public ResponseEntity<Void> actualizaVenta(@PathVariable Long ventaId, @RequestBody Venta venta) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{ventaId}")
    public ResponseEntity<Void> eliminaVenta(@PathVariable Long ventaId) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

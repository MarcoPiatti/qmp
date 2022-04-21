package com.qmp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TipoPrendaTest {
  @Test
  public void unTipoPrendaDebeTenerNombre() {
    assertThrows(NullPointerException.class, () -> unTipoPrendaSinNombre());
  }

  @Test
  public void unTipoPrendaDebeTenerCategoria() {
    assertThrows(NullPointerException.class, () -> unTipoPrendaSinCategoria());
  }

  private TipoPrenda unTipoPrendaSinNombre() {
    return new TipoPrenda(null, CategoriaPrenda.INFERIOR);
  }

  private TipoPrenda unTipoPrendaSinCategoria() {
    return new TipoPrenda("pantaloncito", null);
  }
}

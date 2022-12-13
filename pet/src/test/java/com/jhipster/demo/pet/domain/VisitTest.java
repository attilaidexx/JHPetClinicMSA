package com.jhipster.demo.pet.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.jhipster.demo.pet.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class VisitTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Visit.class);
        Visit visit1 = new Visit();
        visit1.setId("id1");
        Visit visit2 = new Visit();
        visit2.setId(visit1.getId());
        assertThat(visit1).isEqualTo(visit2);
        visit2.setId("id2");
        assertThat(visit1).isNotEqualTo(visit2);
        visit1.setId(null);
        assertThat(visit1).isNotEqualTo(visit2);
    }
}
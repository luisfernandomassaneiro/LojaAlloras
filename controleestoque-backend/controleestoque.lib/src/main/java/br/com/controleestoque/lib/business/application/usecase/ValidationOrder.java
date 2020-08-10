package br.com.controleestoque.lib.business.application.usecase;

import br.com.controleestoque.lib.business.application.validation.LazyValidation;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({Default.class, LazyValidation.class})
public interface ValidationOrder {
}

package com.simdev.sharedlib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * {@code MessageDto} est un objet de transfert de données (DTO) utilisé pour véhiculer
 * un message simple contenant un nom et des détails associés.
 * <p>
 * Cette classe implémente {@link Serializable} afin de permettre sa sérialisation,
 * indispensable lors d'un échange via des systèmes distribués (Kafka, Redis, etc.)
 * ou pour être conservée en cache/session.
 * </p>
 *
 * <p><strong>Annotations Lombok utilisées :</strong></p>
 * <ul>
 *     <li>{@link Data} : génère getters, setters, toString, equals, hashCode</li>
 *     <li>{@link NoArgsConstructor} : constructeur vide</li>
 *     <li>{@link AllArgsConstructor} : constructeur avec tous les champs</li>
 * </ul>
 *
 * <p><strong>Utilisations typiques :</strong></p>
 * <ul>
 *     <li>Transmission de messages entre microservices</li>
 *     <li>Échange d'événements via un broker</li>
 *     <li>Sérialisation/désérialisation JSON ou binaire</li>
 * </ul>
 *
 * <p><strong>Exemple :</strong></p>
 * <pre>{@code
 * MessageDto dto = new MessageDto("Alerte", "Une erreur inattendue est survenue.");
 * }</pre>
 *
 * @author simbie
 * @version 1.1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Le nom ou l'intitulé du message.
     */
    private String name;

    /**
     * Le contenu détaillé du message.
     */
    private String details;
}

package sk.badand.ersystem.domain;

import sk.badand.ersystem.domain.compositeKeys.ProjectReviewerId;

import javax.persistence.*;

/**
 * Created by abadinka on 27. 6. 2016.
 */
@Entity
@IdClass(ProjectReviewerId.class)
public class ProjectReview {

    @Id
    private long projectId;

    @Id
    private long userId;

    @Column(nullable = false)
    private String review;

    @ManyToOne
    @JoinColumn(name = "userId", insertable = false, updatable = false)
    private User reviewer;

    @ManyToOne
    @JoinColumn(name = "projectId", insertable = false, updatable = false)
    private Project reviewedProject;


}

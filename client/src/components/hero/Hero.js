import React from 'react'

import './Hero.css';
import Carousel from 'react-material-ui-carousel';
import { Paper } from '@mui/material'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCirclePlay } from '@fortawesome/free-solid-svg-icons';
import { Link, useNavigate } from 'react-router-dom';
import { Button } from 'react-bootstrap';

const Hero = ({
    movies
}) => {

    const navigate = useNavigate();

    function reviews(movieId) {
        navigate(`/reviews/${movieId}`);
    }

  return (
    <div className='movie-carousel-container'>
        <Carousel>
            {
                movies.map((movies) => {
                    return (
                        <div key={movies.imdbId}>
                            <Paper key={movies.imdbId}>
                                <div className='movie-card-container'>
                                    <div className='movie-card' style={{backgroundImage: `url(${movies.backdrops[0]})`}}>
                                        <div className='movie-detail'>
                                            <div className='movie-poster'>
                                                <img src={movies.poster} alt="" />
                                            </div>
                                            <div className='movie-title'>
                                                <h4>{movies.title}</h4>
                                            </div>
                                            <div className='movie-buttons-container'>
                                                <Link to={`/trailer/${movies.trailerLink.substring(movies.trailerLink.length - 11)}`}>
                                                    <div className='play-button-icon-container'>
                                                        <FontAwesomeIcon className='play-button-icon' icon={faCirclePlay}></FontAwesomeIcon>
                                                    </div>
                                                </Link>

                                                <div className='movie-review-button-container'>
                                                    <Button variant='info' onClick={() => reviews(movies.imdbId)}>Reviews</Button>
                                                </div>
                                                
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </Paper>
                        </div>
                        
                    )
                })
            }
        </Carousel>
    </div>
  )
}

export default Hero